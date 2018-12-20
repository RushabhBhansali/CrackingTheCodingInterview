package Q3_06_Animal_Shelter;

public abstract class P_Animal {
    // 0 for dog 1 for cat
    static int ordercount = 0;
    int type;
    int order;

    P_Animal(int type){
        this.type = type;
        order = ordercount;
        ordercount += 1;
    }



}
