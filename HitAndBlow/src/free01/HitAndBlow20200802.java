package free01;

import java.util.Arrays;
import java.util.Scanner;

public class HitAndBlow20200802 {

    /*
     * specification �d�l
     * 1.create non-overlapping random number.
     * 2.User input a number.
     * 3.Judge hit and blow
     */
    public static void main(String[] args) {
	// 1.�������쐬����
	int[] rand = randomNumberMake();
	System.out.println(rand.toString());

	while (true) {
	    // 2.���͂���
	    int[] input = inputNumber();
	    // 3 ���肷��
	    if (judgement(input, rand)) {
		break;
	    }
	}
    }

    /*
     * random number creation method �����������\�b�h
     *
     * @return int[] rand ��������������z��Ɋi�[��������
     *
     */
    public static int[] randomNumberMake() {
	int[] rand = new int[4];

	while (true) {

	    for (int i = 0; i < 4; i++) {
		rand[i] = (int) (Math.random() * 10);
		System.out.println(rand[i]);
	    }
	    // if first digit is not 0, go to the way of break.
	    if (rand[0] != 0) {
		// if randNumber is not duplicated, go to break.
		if (duplicationCheck(rand)) {
		    break;
		}
	    }
	}
	System.out.println(Arrays.toString(rand));//
	return rand;//
    }

    /*
     * Check for duplication method ���������������d�����Ă��邩���肵�܂��B
     *
     * @param int[] intArray ������������
     *
     * @retrun boolean duplicatedFlag �������d�����Ă���false,�����łȂ�������true.
     */
    public static boolean duplicationCheck(int[] intArray) {
	boolean dupulicatedFlag = true;
	// if randNumber is not dupulicated, break.
	for (int i = 0; i < intArray.length; i++) {
	    for (int j = 0; j < i; j++) {
		if (intArray[i] == intArray[j]) {
		    dupulicatedFlag = false;
		}
	    }
	}
	return dupulicatedFlag;
    }

    /*
     * Number input method �������̓��\�b�h
     *
     * @param �Ȃ�
     *
     * @return int[] inputNumber ���͂��ꂽ����
     */
    public static int[] inputNumber() {
	Scanner sc = new Scanner(System.in);
	int[] inputNumber = new int[4];

	int number = sc.nextInt();
	//	�ꌅ����������
	for (int i = 3; i >= 0; i--) {
	    inputNumber[i] = number % 10;
	    number = number / 10;
	    System.out.println("inputNumber : " + i + " " + inputNumber[i]);
	}
	return inputNumber;

    }

    /*
     * Judgement method ���胁�\�b�h ���͂��ꂽ�����Ɛ������ꂽ�������r���āA���肵�܂��B
     *
     * @param int[] inputNum ���͂��ꂽ����,
     *
     * @param int[] randNum ������������
     *
     * @return boolean correctFlag ����������true,�����łȂ�������false
     */
    public static boolean judgement(int[] inputNum, int[] randNum) {
	int BlowCnt = 0, HitCnt = 0;
	boolean correctFlag;

	for (int i = 0; i < inputNum.length; i++) {
	    for (int j = 0; j < inputNum.length; j++) {
		if (inputNum[i] == randNum[j]) {
		    BlowCnt++;
		}
	    }
	}
	for (int i = 0; i < inputNum.length; i++) {
	    if (inputNum[i] == randNum[i]) {
		HitCnt++;
	    }
	}
	System.out.println(HitCnt + "Hit " + (BlowCnt - HitCnt) + "Blow");
	if (HitCnt == 4) {
	    System.out.println("�����ł��B");
	    correctFlag = true;
	} else {
	    correctFlag = false;
	}
	return correctFlag;
    }
}
