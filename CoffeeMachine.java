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
            System.out.println("1. ���������� | 2. �Ƹ޸�ī�� | 3. ����Ŀ�� | 4. ä��� | 5. ����");
            System.out.print("Ŀ�Ǹ� �����ϼ���: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                coffee = new Espresso();
                if (coffee.checkStocks(Machine)) {
                    coffee.makeCoffee(Machine);
                    System.out.println("���������Ұ� �ϼ��Ǿ����ϴ�.");
                } else {
                    System.out.println("��ᰡ �����մϴ�.");
                }
            } else if (choice == 2) {
                coffee = new Americano();
                if (coffee.checkStocks(Machine)) {
                    coffee.makeCoffee(Machine);
                    System.out.println("�Ƹ޸�ī�밡 �ϼ��Ǿ����ϴ�.");
                } else {
                    System.out.println("��ᰡ �����մϴ�.");
                }
            } else if (choice == 3) {
                coffee = new SugarCoffee();
                if (coffee.checkStocks(Machine)) {
                    coffee.makeCoffee(Machine);
                    System.out.println("����Ŀ�ǰ� �ϼ��Ǿ����ϴ�.");
                } else {
                    System.out.println("��ᰡ �����մϴ�.");
                }
            } else if (choice == 4) {
                Machine.refillStocks();
                System.out.println("��Ḧ ä�����ϴ�.");
            } else if (choice == 5) {
                break;
            }
            System.out.println("���� ���: Ŀ��(" + Machine.getCoffeeStock() +
                    "), ��(" + Machine.getWaterStock() +
                    "), ����(" + Machine.getSugarStock() + ")");
        }

        scanner.close();
    }
}
