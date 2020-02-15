
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
    let k=0;
    for (let i = 0; i < rows; i++) {
        tr = document.createElement("tr");
        for (let j = 0; j < columns; j++) {
            td = document.createElement("td");
            td.setAttribute("contenteditable","true");
            // text = document.createTextNode((i + 1) + "." + (j + 1));
            // td.appendChild(text);
            tr.appendChild(td);
            if (j===columns-1) {
                k++;
                td = document.createElement("td");
                    var checkbox = document.createElement('input');
                    checkbox.type = "checkbox";
                    checkbox.name = "name";
                    checkbox.value = "true";
                    checkbox.id="checkbox"+k;
                    td.appendChild(checkbox);
                tr.appendChild(td);
                k++;
                td = document.createElement("td");
                var checkbox = document.createElement('input');
                checkbox.type = "checkbox";
                checkbox.name = "name";
                checkbox.value = "true";
                checkbox.id="checkbox"+k;
                td.appendChild(checkbox);
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



function saveToDb() {

    var myTableArray = [];
    $("table#table tr").each(function () {
        var arrayOfThisRow = [];
        var tableData = $(this).find('td');
        if(tableData.length>0){
            tableData.each(function () {
                arrayOfThisRow.push($(this).text());
            });
            myTableArray.push(arrayOfThisRow);
        }
    });

    console.log(myTableArray);


    function Event(nameEvent, kefEvent, loseEvent, backEvent) {
        this.nameEvent = nameEvent;
        this.kefEvent = kefEvent;
        this.loseEvent = loseEvent;
        this.backEvent = backEvent;
    }

    function Events(events) {
        this.events = Array.from(events);
    }

    Events.prototype.addEvent = function (event) {
        this.events = this.events.concat(event);
    }


    var event;
    let myEvents;

    let k=1;
    for (var i = 1, row; row = table.rows[i]; i++) {
        for (var j = 0, col; col = row.cells[j]; j++) {
            if (j==0){
                event = new Event();
                event.nameEvent = col.innerText;
                console.log(event);
            }
            if (j==1){
                event.kefEvent = col.innerText;
            }
            if (j==2){
                console.log(k)
                let checkbox = document.getElementById("checkbox"+k);
                k++;
                if (checkbox.checked === true){
                event.backEvent = "true";
                } else { event.backEvent = "false";}
            }
            if (j==3){
                let checkbox = document.getElementById("checkbox"+k);
                k++;
                if (checkbox.checked === true){
                    event.loseEvent = "true";
                } else { event.loseEvent = "false";}
            }
            if ( i===1 && j===0 ){
                myEvents = new Events([]);
              }

            if (j+1 === row.cells.length){
                myEvents.addEvent(event);
            }


        }
    }
          //  let myEvents = new Events(new Event("1", "2", "3", "4"));
          //  myEvents.addEvent(new Event("1", "2", "3", "4"));

     console.log(myEvents);
}
