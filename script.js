var selectedRow = null

function onSubmit() {

    var formData = readFormData();
    if (selectedRow == null)
        insertNewRecord(formData);
    else
        updateRecord(formData);
    resetForm();
}


function readFormData() {
    var formData = {};
    formData["empName"] = document.getElementById("empName").value;
    formData["empEmail"] = document.getElementById("empEmail").value;
    formData["empAge"] = document.getElementById("empAge").value;
    formData["empAddress"] = document.getElementById("empAddress").value;
    return formData;
}

function insertNewRecord(data) {
    var table = document.getElementById("employeeList").getElementsByTagName('tbody')[0];
    var newRow = table.insertRow(table.length);
    cell1 = newRow.insertCell(0);
    cell1.innerHTML = data.empName;
    cell2 = newRow.insertCell(1);
    cell2.innerHTML = data.empEmail;
    cell3 = newRow.insertCell(2);
    cell3.innerHTML = data.empAge;
    cell4 = newRow.insertCell(3);
    cell4.innerHTML = data.empAddress;
    cell4 = newRow.insertCell(4);
    cell4.innerHTML = `<a onClick="Edit(this)">Edit</a>
                       <a onClick="Delete(this)">Delete</a>`;
}

function resetForm() {
    document.getElementById("empName").value = "";
    document.getElementById("empEmail").value = "";
    document.getElementById("empAge").value = "";
    document.getElementById("empAddress").value = "";
    selectedRow = null;
}

function Edit(td) {
    selectedRow = td.parentElement.parentElement;
    document.getElementById("empName").value = selectedRow.cells[0].innerHTML;
    document.getElementById("empEmail").value = selectedRow.cells[1].innerHTML;
    document.getElementById("empAge").value = selectedRow.cells[2].innerHTML;
    document.getElementById("empAddress").value = selectedRow.cells[3].innerHTML;
}

function updateRecord(formData) {
    selectedRow.cells[0].innerHTML = formData.empName;
    selectedRow.cells[1].innerHTML = formData.empEmail;
    selectedRow.cells[2].innerHTML = formData.empAge;
    selectedRow.cells[3].innerHTML = formData.empAddress;
}

function Delete(td) {
    if (confirm('Are you sure to delete this record ?')) {
        row = td.parentElement.parentElement;
        document.getElementById("employeeList").deleteRow(row.rowIndex);
        resetForm();
    }
}