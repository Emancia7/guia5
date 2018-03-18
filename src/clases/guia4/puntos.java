/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.guia4;

/**
 *
 * @author Emancia7
 */
public class puntos {

    public double tamanioPantalla;
    public int capacidadBateria;
    public String marca;
    public double precio;
    public int pixelesFrontal;
    public int pixelesPrincipal;
    public int garantia;
    public int nucleos;
    public double ram;

    public double getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(double tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public int getPixelesFrontal() {
        return pixelesFrontal;
    }

    public void setPixelesFrontal(int pixelesFrontal) {
        this.pixelesFrontal = pixelesFrontal;
    }

    public int getPixelesPrincipal() {
        return pixelesPrincipal;
    }

    public void setPixelesPrincipal(int pixelesPrincipal) {
        this.pixelesPrincipal = pixelesPrincipal;
    }

    //metodos
    public int bateriaPatalla() {
        if (tamanioPantalla <= 4) {
            if (capacidadBateria <= 1200) {
                return 3;
            }
            if (capacidadBateria > 1200 && capacidadBateria < 2400) {
                return 4;
            }
            if (capacidadBateria > 2400 && capacidadBateria < 3100) {
                return 5;
            }
            if (capacidadBateria > 3100) {
                return 6;
            }
        }
        if (tamanioPantalla <= 5) {
            if (capacidadBateria <= 1200) {
                return 1;
            }
            if (capacidadBateria > 1200 && capacidadBateria < 2400) {
                return 2;
            }
            if (capacidadBateria > 2400 && capacidadBateria < 3100) {
                return 3;
            }
            if (capacidadBateria > 3100) {
                return 4;
            }
        }
        if (tamanioPantalla <= 4) {
            if (capacidadBateria <= 1200) {
                return 0;
            }
            if (capacidadBateria > 1200 && capacidadBateria < 2400) {
                return 1;
            }
            if (capacidadBateria > 2400 && capacidadBateria < 3100) {
                return 2;
            }
            if (capacidadBateria > 3100) {
                return 3;
            }
        }
        return 10;
    }

    public int refDeMarca() {
        if (marca.equals("NEXUS") || marca.equals("GOOGLE") || marca.equals("LENOVO") || marca.equals("HUAWEI") || marca.equals("SONY") || marca.equals("APPLE")) {
            return 4;
        } else {
            if (marca.equals("SAMSUNG") || marca.equals("ALCATEL") || marca.equals("LG")) {
                return 3;
            } else {
                return 2;
            }
        }
    }

    public int rangoPrecio() {
        if (precio < 100 && precio > 1) {
            return 2;
        }
        if (precio >= 100 && precio <= 350) {
            return 3;
        }
        if (precio > 350) {
            return 4;
        }
        return -10;
    }

    public int pixelaje() {
        if (pixelesPrincipal <= 5) {
            if (pixelesFrontal < 2) {
                return 1;
            }
            if (pixelesFrontal > 2) {
                return 2;
            }
        }
        if (pixelesPrincipal > 5 && pixelesPrincipal <= 8) {
            if (pixelesFrontal < 2) {
                return 1;
            }
            if (pixelesFrontal > 1 && pixelesFrontal <= 3) {
                return 2;
            }
            if (pixelesFrontal >= 3) {
                return 3;
            }
        }
        if (pixelesPrincipal > 8) {
            if (pixelesFrontal < 2) {
                return 1;
            }
            if (pixelesFrontal > 2 && pixelesFrontal < 5) {
                return 2;
            }
            if (pixelesFrontal > 5) {
                return 3;
            }
        }
        return -10;
    }

    public int garantia() {
        if (garantia <= 3) {
            return 1;
        }
        if (garantia > 3 && garantia < 6) {
            return 2;
        }
        if (garantia > 6) {
            return 4;
        }
        return -10;
    }

    public int cpu() {
        if (nucleos == 2) {
            return 0;
        }
        if (nucleos == 4) {
            return 1;
        }
        if (nucleos == 6) {
            return 2;
        }
        if (nucleos == 8) {
            return 3;
        }
        return -10;
    }

    public int ram() {
        if (ram <= 1) {
            return 0;
        }
        if (ram > 1 && ram < 2) {
            return 2;
        }
        if (ram > 2 && ram < 4) {
            return 4;
        }
        if (ram > 5) {
            return 6;
        }
        return -10;
    }
}
