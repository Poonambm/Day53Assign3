public class MainCounter {
    public static void main(String[] args){
        
        Counter counter = new Counter();
     
        System.out.println("Initialized Counter :" + counter.value());
        counter.increase();
        System.out.println("Increased Counter :"+counter.value());

         counter.increase(5);
         System.out.println("IncreasedBy 5 Counter : "+counter.value());
         counter.decrease();

         System.out.println("Decreased Counter : "+ counter.value());
         counter.increase(-1);
        System.out.println("As increaseBy is negative counter value is unchanged viz :"+counter.value());
        counter.decrease(-1);
        System.out.println("As decreaseBy is negative counter value is unchanged viz :"+ counter.value());
  //      Counter counter1 = new Counter(5);
  //      System.out.println("Initialized Counter :" + counter.value());



    }
}
