// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados
let N = gets();
let clientes = [];

for (let i = 0; i < N; i++) {
    let clientesN = parseInt(gets());
    clientes = gets().split(' ');
    let ordem = Array.from(clientes).sort((a, b) => b - a);
    let naoTrocou = 0;

    for (let i = 0; i < clientesN; i++) if (clientes[i] == ordem[i]) naoTrocou++;

    console.log(naoTrocou)
}