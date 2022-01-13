let N = gets();
let words = [];

for (let i = 0; i < N; i++) {
    words = gets().split(" ");
    words.sort((a, b) => b.length - a.length || a.localeCompare(b));
    console.log(words.join(" "));
}