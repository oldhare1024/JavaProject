package test4;

public class CompanySalary {
    public static void main(String[] args) {
        //����һ��employee���������
        Employee[] employee=new Employee[3];

        //employee[0]��YearWorker����ת�Ͷ���
        employee[0]=new YearWorker(1,48000.0);

        //employee[1]��MonthWorker����ת�Ͷ���
        employee[1]=new MonthWorker(12,4000.0);

        //employee[2]��WeekWorker����ת�Ͷ���
        employee[2]=new WeekWorker(48,1000.0);

        //Company com=new Company(employee);

        double sumSalary;

        sumSalary=employee[0].earnings()+employee[1].earnings()+employee[2].earnings();  //���Ըĳ�ѭ���ṹ
        System.out.println("��˾֧������нˮΪ:"+sumSalary);

    }
}
