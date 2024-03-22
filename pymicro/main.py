import json
from flask import Flask, jsonify, request, abort,render_template

app = Flask(__name__)

data = [ {
    "codigo": 2603,
    "identificacion": "0928551803",
    "nombres":"Angel Parra",
    "direccion":"Guayaquil",
    "formaPago":"canales_digitales"
},
{
    "codigo": 456789,
    "identificacion": "055555555",
    "nombres":"Aaron Parra",
    "direccion":"Duran",
    "formaPago":"canales_digitales"
}]

@app.route('/canales_digitales',methods= ['GET'])
def retunpersonas():
    if(request.method =='GET'):
        return jsonify(data)

@app.route('/canales_digitales_html', methods=['GET'])
def return_personas_html():
    if request.method == 'GET':
        return render_template('personas.html', personas=data)
    

@app.route('/canales_digitales/<int:codigo>',methods = ['GET'])
def retunpersona(codigo):
    if(request.method =='GET'):
        for person in data:
            if(person.get("codigo") == codigo):
                return jsonify(person)
        abort(404)

@app.route('/canales_digitales',methods= ['POST'])
def addpersona():
    if((request.method=='POST')and(request.headers.get('Content-Type')=='application/json')):
        person = request.json
        data.append(person)
        return "ok"
    else:
        abort(404,"Solo se acepta application/json")


if __name__ == '__main__':
    app.run(debug=True)
