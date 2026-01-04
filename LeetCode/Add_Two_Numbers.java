
class Solution {
    int resultado1 = 0;
    int resultado2 = 0;
    int mult = 1;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    for(int i = l1.length; i > 0; i-- ){
    
        resultado1 += l1[i] * mult;
        mult *= 10;
    }
    mult = 1;
    for(int i = l2.length; i > 0; i-- ){
        
        resultado2 += l2[i] * mult;
        mult *= 10;
    }
        int resultado = resultado1 + resultado2;
        String numStr = Integer.toString(resultado);
        char numArr[] = numStr.toCharArray();

        return numArr;
    }
}