function createNewCheckbox(name, id){
    const checkbox = document.createElement("input");
    checkbox.type= "checkbox";
    checkbox.name = name;
    checkbox.id = id;
    return checkbox;
}
function addTable() {
    let e = document.getElementById("loc");
    let strUser = e.options[e.selectedIndex].value;
    let body = document.querySelector("body");
    let rows = strUser;
    let columns = 2;
    let tr = "";
    let td = "";
    let firstTable = document.querySelector("table");
    let table = document.getElementById("table");
    document.getElementById("table").addEventListener("keydown", (evt) => {
        if (evt.keyCode === 13) {
            evt.preventDefault();
        }
    });
    /*if (checkbox.checked == true) {
        table.setAttribute("border", "2px");
    } else {
        table.setAttribute("border", "0");
    }
    */

    table.setAttribute("border", "2px");

    if (table.style.display === "none") {
        table.style.display = "inline-table";
    } else {
        table.style.display = "none";
    }
    for (let i = 0; i < rows; i++) {
        tr = document.createElement("tr");
        for (let j = 0; j < columns; j++) {
            td = document.createElement("td");
            td.setAttribute("contenteditable","true");
            // text = document.createTextNode((i + 1) + "." + (j + 1));
            // td.appendChild(text);
            tr.appendChild(td);
            if (j===columns-1) {
                td = document.createElement("td");
                td.appendChild(createNewCheckbox('checkbox' + j, j));
                tr.appendChild(td);
                td = document.createElement("td");
                td.appendChild(createNewCheckbox('checkbox' + j, j));
                tr.appendChild(td);
            }
        }
        table.appendChild(tr);
    }
    if (firstTable == null) {
        return body.appendChild(table);
    } else {
        let newTable = body.appendChild(table);
        return document.body.replaceChild(newTable, firstTable);
    }
}