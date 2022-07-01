package com.company.lambdaTest;
/**@
 * Lambda ifadesi ,içinde bulunduğu kapsamdaki statik ve nesne değişkenlerine ulaşabilir.
 * Lambda ifadesi , Local veriable için "pure function" olarak çalışır ancak Instance Veriable için öyle çalışmaz.
 * Dolayısıyla lambda, Instance/Member değişkenlere,objelere erişir ve değiştirebilir.
 * Ama Local değişkenlere,objelere erişir ancak onu değiştiremez !.
 @**/

public class LambdaTest2 {
    String name = "Ali Veli";
    int age = 32;

    public static void main(String[] args) {
        LambdaTest2 lambdaTest2 = new LambdaTest2();
        int height = 182;
        int weight = 82;

        JustTest mainLambda = () -> {
         System.out.println(lambdaTest2.name+" "+lambdaTest2.age+" "+height+" "+weight);
         lambdaTest2.name = "Ahmet Veli";
         lambdaTest2.age++;
         System.out.println(lambdaTest2.name+" "+lambdaTest2.age+" "+height+" "+weight);

         //compiler-error
//         height++;
//         weight++;

        };
        mainLambda.testing();

    }


}
@FunctionalInterface
interface JustTest{
    void testing();
}
