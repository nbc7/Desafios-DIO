let input = gets();
let list = [];

function friend(list) {
    let winner = list
        .filter(value => value.option === "SIM")
        .sort((a, b) => b.name.length - a.name.length);

    list.sort((a, b) => {
        if (a.option < b.option) return 1;
        if (a.option > b.option) return -1;
        if (a.name < b.name) return -1;
        if (a.name > b.name) return 1;
    });
    console.log(list.map(a => console.log(a.name)).join(" "));
    console.log("\n Amigo do Pablo:");
    console.log(winner[0].name);
}

do {
    let [name, option] = input.split(" ");

    if (!list.some(e => e.name === name) || list == "") {
        list.push({ name: name, option: option });
    }
    input = String(gets());
} while (input != "FIM");

friend(list);