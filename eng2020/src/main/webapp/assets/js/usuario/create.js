/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {

    var UF_LIST = [];

    //dynamically define phone number format
    var SPMaskBehavior = function (val) {
        return val.replace(/\D/g, '').length === 11 ? '(00) 00000-0000' : '(00) 0000-00009';
    },
            spOptions = {
                onKeyPress: function (val, e, field, options) {
                    field.mask(SPMaskBehavior.apply({}, arguments), options);
                }
            };
    $('#cliente-telefone').mask(SPMaskBehavior, spOptions);

    //populate uf-select with Brazil's Federative Units
    $.getJSON('https://servicodados.ibge.gov.br/api/v1/localidades/estados?orderBy=nome', function (data) {
        $.each(data, function (index, data) {
            $('#uf-select').append('<option value="' + data.id + '"' + '>' + data.sigla + '</option>');
            UF_LIST.push(data);
            console.log(data.sigla);
        });
        $('#uf-select').attr('disabled', false);
    });

    //populate City-select with cities from selected UF
    $('#uf-select').on('change', async function () {
        var selected_UF = $('#uf-select').val();
        await disableCitySelect();
        await populateCitySelect(selected_UF);
        if((selected_UF) != "undefined"){
            enableCitySelect();
        }
    });
});

function disableCitySelect() {
    $('#city-select').attr('disabled', true);
}

function enableCitySelect() {
    $('#city-select').attr('disabled', false);
}

async function populateCitySelect(UF) {
    $('#city-select')
        .empty()
        .append('<option value="undefined">Cidade</option>');

    await ($.getJSON('https://servicodados.ibge.gov.br/api/v1/localidades/estados/' + UF + '/municipios', function (data) {
        $.each(data, function (index, data) {
            $('#city-select').append('<option value="' + data.id + '"' + '>' + data.nome + '</option>');
            console.log("A");
        });
    }));
}