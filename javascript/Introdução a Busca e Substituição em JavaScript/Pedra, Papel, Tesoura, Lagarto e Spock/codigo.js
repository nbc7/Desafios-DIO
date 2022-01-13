let dicionarioDeRegras = {
    tesoura: ['papel', 'lagarto'],
    papel: ['pedra', 'spock'],
    pedra: ['lagarto', 'tesoura'],
    lagarto: ['spock', 'papel'],
    spock: ['tesoura', 'pedra']
};

let N = parseInt(gets());

for (let i = 0; i < N; i++) {

    const [Fernanda, Marcia] = gets().split(' ');
    if (Fernanda === Marcia)
        console.log('empate');
    else
        dicionarioDeRegras[Fernanda].includes(Marcia) ? console.log('fernanda') : console.log('marcia');
}