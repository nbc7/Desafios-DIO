// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados
// Abaixo segue um exemplo de código que você pode ou não utilizar

let totalItems = gets();
let items = [];
let par = [];
let impar = [];

for (let i = 0; i < totalItems; i++) {
    items.push(parseInt(gets()));
}

items.filter((n) => {
    if (n % 2 == 0) par.push(n);
    else impar.push(n);
})

par.sort(function (a, b) { return a - b });
impar.sort(function (a, b) { return b - a });

for (let i = 0; i < par.length; i++) {
    console.log(par[i])
}

for (let i = 0; i < impar.length; i++) {
    console.log(impar[i])
}