package Q3_06_Animal_Shelter;

import java.util.LinkedList;
import java.util.Queue;

public class P_AnimalQueue {
    LinkedList<P_Animal> dq;
    LinkedList<P_Animal> cq;

    public P_AnimalQueue(){
        dq = new LinkedList<>();
        cq = new LinkedList<>();
    }

    public void enqueue(P_Animal animal){
        if(animal.type == 0){
            dq.add(animal);
        }
        else{
            cq.add(animal);
        }
    }

    public P_Animal dqueueAny(){
        int dogOrd = dq.getFirst().order;
        int catOrd = cq.getFirst().order;

        P_Animal ret;
        if(dogOrd < catOrd){
            ret = dq.getFirst();
            dq.removeFirst();
        }
        else{
            ret = cq.getFirst();
            cq.removeFirst();
        }
        return ret;
    }

    public P_Animal dequeueDog(){
        P_Animal ret = dq.getFirst();
        dq.removeFirst();
        return ret;
    }

    public P_Animal dequeueCat(){
        P_Animal ret = cq.getFirst();
        cq.removeFirst();
        return ret;
    }
}
