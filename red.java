function changeTableStyle() {
    let table = document.getElementById("studentTable");

    if (!table) {
        console.error("Table not found!");
        return;
    }

    table.style.border = "2px solid red";
    table.style.backgroundColor = "yellow";

    let ths = table.getElementsByTagName("th");
    Array.from(ths).forEach(th => {
        th.style.backgroundColor = "red";
        th.style.color = "white";
    });

    let tds = table.getElementsByTagName("td");
    Array.from(tds).forEach(td => {
        td.style.backgroundColor = "lightyellow";
        td.style.color = "black";
    });
}
