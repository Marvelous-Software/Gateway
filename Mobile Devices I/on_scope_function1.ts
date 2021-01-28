
function PrintSeparator () {

    console.log("*************************************************************************")

}

function AddVars (val1:number, val2:number) {

    let c1 = val1 + val2
    return c1
}

function AddAndPrintVars (val1:number, val2:number) {

    let c1 = val1 + val2
    console.log("The value of a1 is ", val1)
    console.log("The value of b1 is ", val2)
    console.log("The value of a1 + b1 is ", c1)
    
}

let a1:number = 10
let b1:number = 15

AddAndPrintVars(a1, b1)
PrintSeparator()

a1 = 12
AddAndPrintVars(a1, b1)
PrintSeparator()

a1 = 17
AddAndPrintVars(a1, b1)
PrintSeparator()