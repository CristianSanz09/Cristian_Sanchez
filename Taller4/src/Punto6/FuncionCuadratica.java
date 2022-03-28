package Punto6;

public class FuncionCuadratica {
    private double variablex;
    private double variablea;
    private double variableb;
    private double variablec;
    private double ecuacion;
    private double variableX;
    private double varible;

    public FuncionCuadratica() {
        this.variablex = 0;
        this.variablea = 0;
        this.variableb = 0;
        this.variablec = 0;
        this.ecuacion = 0;
        this.variableX = 0;
        this.varible = 0;
    }

    public double getVariablex() {
        double auxiliar = Math.sqrt(Math.pow(this.variableb, 2)-4*this.variablea*this.variablec);
        this.variablex = (-this.variableb - auxiliar)/(this.variablea*2);
        return variablex;
    }

    public void setVariablex(double variablex) {
        this.variablex = variablex;
    }
    
    public double getVariableX() {
        double aux = Math.sqrt(Math.pow(this.variableb, 2)-4*this.variablea*this.variablec);
        this.variableX = (-this.variableb + aux)/(this.variablea*2);
        return variableX;
    }

    public void setVariableX(double variablex) {
        this.variableX = variablex;
    }

    public double getVariablea() {
        return variablea;
    }

    public void setVariablea(double variablea) {
        this.variablea = variablea;
    }

    public double getVariableb() {
        return variableb;
    }

    public void setVariableb(double variableb) {
        this.variableb = variableb;
    }

    public double getVariablec() {
        return variablec;
    }

    public void setVariablec(double variablec) {
        this.variablec = variablec;
    }

    public double getEcuacion() {
        this.ecuacion = this.variablea * Math.pow(this.variableX,2)+this.variableb*this.varible+this.variablec;
        return ecuacion;
    }

    public void setEcuacion(double ecuacion) {
        this.ecuacion = ecuacion;
    }

    public double getVarible() {
        return varible;
    }

    public void setVarible(double varible) {
        this.varible = varible;
    }
}
