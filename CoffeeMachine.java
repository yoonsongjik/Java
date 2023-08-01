import java.util.Scanner;

interface Coffee {
    void makeCoffee(Machine Machine);
    boolean checkStocks(Machine Machine);
}
class Espresso implements Coffee {
    @Override
    public void makeCoffee(Machine Machine) {
        Machine.useCoffee(1);
        Machine.useWater(1);
    }

    @Override
    public boolean checkStocks(Machine Machine) {
        return Machine.checkCoffee(1) && Machine.checkWater(1);
    }
}

class Americano implements Coffee {
    @Override
    public void makeCoffee(Machine Machine) {
        Machine.useCoffee(1);
        Machine.useWater(2);
    }

    @Override
    public boolean checkStocks(Machine Machine) {
        return Machine.checkCoffee(1) && Machine.checkWater(2);
    }
}

class SugarCoffee implements Coffee {
    @Override
    public void makeCoffee(Machine Machine) {
        Machine.useCoffee(1);
        Machine.useWater(2);
        Machine.useSugar(1);
    }

    @Override
    public boolean checkStocks(Machine Machine) {
        return Machine.checkCoffee(1) && Machine.checkWater(2) && Machine.checkSugar(1);
    }
}
class Machine {
    private int coffeeStock;
    private int waterStock;
    private int sugarStock;

    public Machine() {
        coffeeStock = 10;
        waterStock = 10;
        sugarStock = 10;
    }

    public void useCoffee(int amount) {
        coffeeStock -= amount;
    }

    public void useWater(int amount) {
        waterStock -= amount;
    }

    public void useSugar(int amount) {
        sugarStock -= amount;
    }

    public boolean checkCoffee(int amount) {
        return coffeeStock >= amount;
    }

    public boolean checkWater(int amount) {
        return waterStock >= amount;
    }

    public boolean checkSugar(int amount) {
        return sugarStock >= amount;
    }

    public void refillStocks() {
        coffeeStock = 10;
        waterStock = 10;
        sugarStock = 10;
    }
    public int getCoffeeStock() {
        return coffeeStock;
    }

    public int getWaterStock() {
        return waterStock;
    }

    public int getSugarStock() {
        return sugarStock;
    }
}
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Machine Machine = new Machine();
        Coffee coffee;

        while (true) {
            System.out.println("1. 에스프레소 | 2. 아메리카노 | 3. 설탕커피 | 4. 채우기 | 5. 종료");
            System.out.print("커피를 선택하세요: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                coffee = new Espresso();
                if (coffee.checkStocks(Machine)) {
                    coffee.makeCoffee(Machine);
                    System.out.println("에스프레소가 완성되었습니다.");
                } else {
                    System.out.println("재료가 부족합니다.");
                }
            } else if (choice == 2) {
                coffee = new Americano();
                if (coffee.checkStocks(Machine)) {
                    coffee.makeCoffee(Machine);
                    System.out.println("아메리카노가 완성되었습니다.");
                } else {
                    System.out.println("재료가 부족합니다.");
                }
            } else if (choice == 3) {
                coffee = new SugarCoffee();
                if (coffee.checkStocks(Machine)) {
                    coffee.makeCoffee(Machine);
                    System.out.println("설탕커피가 완성되었습니다.");
                } else {
                    System.out.println("재료가 부족합니다.");
                }
            } else if (choice == 4) {
                Machine.refillStocks();
                System.out.println("재료를 채웠습니다.");
            } else if (choice == 5) {
                break;
            }
            System.out.println("남은 재료: 커피(" + Machine.getCoffeeStock() +
                    "), 물(" + Machine.getWaterStock() +
                    "), 설탕(" + Machine.getSugarStock() + ")");
        }

        scanner.close();
    }
}
