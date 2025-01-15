import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class Main2 {

    static class API {
        private  String apiGET(String novaRota) {
            HttpURLConnection conexao = null;
            BufferedReader in = null;

            try {
                URL url = new URL(novaRota);
                conexao = (HttpURLConnection) url.openConnection();
                conexao.setRequestMethod("GET");
                conexao.setRequestProperty("Content-Type", "application/json");
                conexao.setRequestProperty("Accept", "application/json");

                if (conexao.getResponseCode() == 200) {
                    in = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
                    String inputLine;
                    StringBuilder response = new StringBuilder();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }

                    return response.toString();
                } else {
                    return conexao.getResponseCode() + " " + conexao.getResponseMessage();
                }

            } catch (Exception e) {
                e.printStackTrace();
                return "-> Erro: " + e.getMessage()+"     "+e;
            }
            finally {
                try {
                    if (in != null) {

                        in.close();
                        conexao.disconnect();


                    }
                } catch (IOException e) {
                    conexao.disconnect();
                    e.printStackTrace();
                }
                if (conexao != null) {

                    conexao.disconnect();
                }
            }
        }


        public Object[] valores() {
            String retAPi = apiGET("http://192.168.0.114:3000/dadosFaturamentoDiarioDistribuidora");

            try {
                JSONArray jsonArray = new JSONArray(retAPi);

                Object[] totals = new Object[jsonArray.length()];

                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    totals[i] = jsonObject.getDouble("valor");
                }

                return totals;
            } catch (Exception err) {
                System.out.println("> Erro ao processar a resposta da API: " + err.getMessage());
                return null;
            }
        }



    }
    public static void main(String[] args) {

        API api = new API ();

        Object [] retApi = api.valores() ;


        System.out.println("> Exercicio 3 ");
        System.out.println("> Dados de retorno da api ");
         double auxMaior = 0  , auxMenor = 0 ;
        int cont = 0 ;

        try {
            for (int i = 0; i < retApi.length; i++) {
                double valor = (double) retApi[i];
                cont = cont + 1;
                System.out.println("- Dia " + (i + 1) + " - contribuição R$" + valor);
                if (i == 0) {
                    auxMaior = (double) retApi[i];
                    auxMenor = (double) retApi[i];
                }
                if ((double) retApi[i] != 0 && auxMaior < (double) retApi[i]) {
                    auxMaior = (double) retApi[i];
                }
                if ((double) retApi[i] != 0 && (double) retApi[i] < auxMenor) {
                    auxMenor = (double) retApi[i];
                }
            }


            System.out.println(
                    "\n> Maior valor faturado registrado " + auxMaior +
                            "\n> Menor valor faturadi  registrado " + auxMenor +
                            "\n> Em dias" + cont + "Resgistrado na api"
            );
        } catch (Exception e) {
            System.out.println("erro na execução do processp "+e);
        }



    }
}
