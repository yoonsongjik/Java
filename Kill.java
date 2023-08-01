class Weapon {
    protected int fire() {
        return 1; // 무기는 기본적으로 한 명만 살상
    }
}

class Cannon extends Weapon {
    protected int fire() {
        return 10; // 대포는 10명 살상 가능
    }
}

public class Kill {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        System.out.println("기본 무기 살상 능력: " + weapon.fire()); // 1 출력
        
        Cannon cannon = new Cannon();
        System.out.println("대포 살상 능력: " + cannon.fire()); // 10 출력
    }
}
