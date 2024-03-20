import json
from flask import Flask, jsonify, request, abort

app = Flask(__name__)

data = [ {
    "codigo": 12345,
    "identificacion": "098765432",
    "nombre":"Angel Parra",
    "direccion":"Guayaquil"
},
{
    "codigo": 456789,
    "identificacion": "055555555",
    "nombre":"Emanuel Parra",
    "direccion":"Duran"
}]

@app.route('/persons',methods= ['GET'])
def retunpersonas():
    if(request.method =='GET'):
        return jsonify(data)
    

@app.route('/persons/<int:codigo>',methods = ['GET'])
def retunpersona(codigo):
    if(request.method =='GET'):
        for person in data:
            if(person.get("codigo") == codigo):
                return jsonify(person)
        abort(404)

@app.route('/persons',methods= ['POST'])
def addpersona():
    if((request.method=='POST')and(request.headers.get('Content-Type')=='application/json')):
        person = request.json
        data.append(person)
        return "ok"
    else:
        abort(404,"Solo se acepta application/json")


if __name__ == '__main__':
    app.run(debug=True)
