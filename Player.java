public class Player {
    String namePlayer = "HORNIE HIPPO 2711";
    int x;
    int y;
    int health = 100;
    int speed = 1;
    int attack = 2;
    int defense = 10;
    boolean firstSkill = true;
    boolean secondSkill = true;
    boolean ultimateSkill = true;

    public void GetInfoPlayer(){
        System.out.println("Informasi Player \nNickname : " + namePlayer + "\nPosisi Player" + "\nX : " + x + "\nY : " + y + " \nHealth : " + health + "\nSpeed : " + speed + "\nAttack : " + attack + "\nDefense : " + defense + "\nSkill Pertama : " + firstSkill + "\nSkill Kedua : " + secondSkill + "\nUltimate Skill : " + ultimateSkill);
    }
    public void moveRight(){
        x = x + speed;
        System.out.println(namePlayer + " bergerak ke kanan\nX : " + x + "\nY : " + y);
    }
    public void moveLeft(){
        y = y + speed;
        System.out.println(namePlayer + " bergerak ke kiri\nX : " + x + "\nY : " + y);
    }
    public void playerAttack(){
        attack;
    }

}
