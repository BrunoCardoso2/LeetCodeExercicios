class Solution {
    public int[] plusOne(int[] digits) {
        int numero = 0;
        for (int i = 0; i < digits.length; i++) {
            numero = numero * 10 + digits[i];
        }
        numero += 1;
        String s = String.valueOf(numero);
        int[] vetor = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            vetor[i] = s.charAt(i) - '0';
        }
        return vetor;
    }
}