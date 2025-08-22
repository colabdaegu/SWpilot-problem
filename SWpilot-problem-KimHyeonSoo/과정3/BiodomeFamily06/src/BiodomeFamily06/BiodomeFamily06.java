package BiodomeFamily06;

import java.util.*;

public class BiodomeFamily06 {
    public static void main(String[] args) {
        // LinkedList를 이용하여 5가지 동물 객체를 생성
        LinkedList<Animal> inputList = new LinkedList<>();
        inputList.add(new Animal("제니", "원숭이", 4));
        inputList.add(new Animal("고먀", "코끼리", 4));
        inputList.add(new Animal("타이", "호랑이", 9));
        inputList.add(new Animal("로아", "코뿔소", 5));
        inputList.add(new Animal("바비", "사슴", 7));

        // 입력 리스트를 출력
        printList(inputList);

        
        // 안전한 순서로 재구성
        LinkedList<Animal> safeOrder = buildSafeOrder(inputList);

        // 순서 지정
        System.out.print("→ ");
        printList(safeOrder);
    }

    
    // 안전한 순서를 찾기 위한 순열 기반 함수
    private static LinkedList<Animal> buildSafeOrder(List<Animal> animals) {
        List<List<Animal>> result = new ArrayList<>();
        permutations(new ArrayList<>(), new ArrayList<>(animals), result);

        for (List<Animal> order : result) {
            if (isSafe(order)) {
                return new LinkedList<>(order);
            }
        }

        return null;
    }
    
    // 순열 생성 (재귀 방식 - 요소 하나씩 뽑아 쌓기)
    private static void permutations(List<Animal> current, List<Animal> remaining, List<List<Animal>> result) {
        if (remaining.isEmpty()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < remaining.size(); i++) {
            List<Animal> nextCurrent = new ArrayList<>(current);
            nextCurrent.add(remaining.get(i));

            List<Animal> nextRemaining = new ArrayList<>(remaining);
            nextRemaining.remove(i);

            permutations(nextCurrent, nextRemaining, result);
        }
    }

    // 안전 조건 검사
    private static boolean isSafe(List<Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            Animal current = list.get(i);

            // 호랑이는 사슴 뒤에 올 수 없음
            if (current.getSpecies().equals("호랑이") && i > 0) {
                Animal prev = list.get(i - 1);
                if (prev.getSpecies().equals("사슴")) return false;
            }

            // 5살 이하 코끼리는 호랑이 앞에 올 수 없음
            if (current.getSpecies().equals("코끼리") && current.getAge() <= 5) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(j).getSpecies().equals("호랑이")) return false;
                }
            }
        }
        return true;
    }
    

    private static void printList(List<Animal> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) System.out.print(", ");
        }
        System.out.println("] \n");
    }
}