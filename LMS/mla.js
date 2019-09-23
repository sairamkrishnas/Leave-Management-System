var selecedRow = null;
function onFormSubmit() {
    if (validate()) {
        var formData = readFormData();
        if (selectedRow == null)
            insertNewRecord(formData);
        else
            updateRecord(formData);
        resetForm();
    }
}

function readFormData() {
    var formData = {};
    formData["startdate"] = document.getElementById("startdate").value;
    formData["enddate"] = document.getElementById("enddate").value;
    formData["numberofdays"] = document.getElementById("numberofdays").value;
    formData["leavereason"] = document.getElementById("leavereason").value;
    return formData;
}
function insertNewRecord(data) {
    var table = document.getElementById("leavelist").getElementsByTagName('tbody')[0];
    var newRow = table.insertRow(table.length);
    cell1 = newRow.insertCell(0);
    cell1.innerHTML = data.startdate;
    cell2 = newRow.insertCell(1);
    cell2.innerHTML = data.enddate;
    cell3 = newRow.insertCell(2);
    cell3.innerHTML = data.numberofdays;
    cell4 = newRow.insertCell(3);
    cell4.innerHTML = data.leavereason;
    cell4 = newRow.insertCell(4);
    //cell4.innerHTML = `<button onClick="onEdit(this)">Accept</button>
                      // <button onClick="onDelete(this)"id="employeeList">Cancel</button>`;
}