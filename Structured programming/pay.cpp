#include <iostream> //Required for cin, cout.
using namespace std;
//Function prototype
void CalculatePay(double &);
int main()
{

    double workerPay;
    double bossPay;
    double SecretaryPay;

    workerPay = 500;
    SecretaryPay = 600;
    bossPay = 1000;

    CalculatePay(workerPay);
    CalculatePay(bossPay);
    CalculatePay(SecretaryPay);

    return 0;
}

void CalculatePay(double &pay)
{
    cout << "Pay = " << pay - pay * .1 << endl;
    return;
}
