let Star_Unicode = 9733/*★のUnicode*/;
let Star_Chain = function () {
    let Stars = "";
    for (let i = 0; i < 5; i++) {
        Stars += String.fromCharCode(Star_Unicode)
    };
    return Stars;
};
document.getElementById("Black_Stars").innerHTML = Star_Chain();

let Star_Area = function () {
    let Stars = "";
    for (let i = 0; i < 25; i++) {
        let Star_Number = Star_Unicode
        if (i % 2 === 1) {
            Star_Number += 1;
        }
        Stars += String.fromCharCode(Star_Number)
        if (i % 5 === 4) {
            Stars += "<br>";
        }
    };
    return Stars;
}
document.getElementById("5_5_Stars").innerHTML = Star_Area();
Disabler = function (M, P, IDs) {
    if (M < P) {
        document.getElementById(IDs).disabled = true;
    }
    else {
        document.getElementById(IDs).disabled = false;
    }

}
let Money_3 = 0;
let Goods_Price_3 = Infinity;

document.getElementById("Money_3").addEventListener("input", function () {
    Money_3 = document.getElementById("Money_3").value;
});

document.getElementById("Juice_3").addEventListener("change", function () {
    let Goods_3 = document.getElementById("Juice_3");
    let Goods_Data_3 = Goods_3.options[Goods_3.selectedIndex];
    Goods_Price_3 = Goods_Data_3.getAttribute('data-price');
});
document.getElementById("Button_3").addEventListener("click", function () {
    if (Money_3 >= Goods_Price_3) {
        document.getElementById("Change_3").innerHTML = "おつりは" + (Money_3 - Goods_Price_3) + "円です";
    }
    else {
        document.getElementById("Change_3").innerHTML = "お金が足りません";
    }


});

let Money_4 = 0;
let Goods_Price_4 = Infinity;
document.getElementById("Money_4").addEventListener("input", function () {
    Money_4 = document.getElementById("Money_4").value;
    if (Money_4 >= 150) {
        document.getElementById("Coffee_4").disabled = false;
    }
    else {
        document.getElementById("Coffee_4").disabled = true;
    }
    if (Money_4 >= 130) {
        document.getElementById("Tea_4").disabled = false;
    }
    else {
        document.getElementById("Tea_4").disabled = true;
    }
    if (Money_4 >= 160) {
        document.getElementById("Orange_4").disabled = false;
    }
    else {
        document.getElementById("Orange_4").disabled = true;
    }
    if (Money_4 >= 100) {
        document.getElementById("Water_4").disabled = false;
    }
    else {
        document.getElementById("Water_4").disabled = true;
    }
    if (Money_4 < Goods_Price_4) {
        Goods_Price_4 = Infinity;
        document.getElementById("Button_4").disabled = true;
    }
    else {
        document.getElementById("Button_4").disabled = false;
    }
});
document.getElementById("Juices_4").addEventListener("click", function () {
    if (document.getElementById("Coffee_4").checked) {
        Goods_Price_4 = 150;
    }
    if (document.getElementById("Tea_4").checked) {
        Goods_Price_4 = 130;
    }
    if (document.getElementById("Orange_4").checked) {
        Goods_Price_4 = 160;
    }
    if (document.getElementById("Water_4").checked) {
        Goods_Price_4 = 100;
    }

    if (Money_4 < Goods_Price_4) {
        Goods_Price_4 = Infinity;
        document.getElementById("Button_4").disabled = true;
    }
    else {
        document.getElementById("Button_4").disabled = false;
    }
});

document.getElementById("Button_4").addEventListener("click", function () {
    document.getElementById("Change_4").innerHTML = "おつりは" + (Money_4 - Goods_Price_4) + "円です";
});


