public class ParametrosInvalidosException extends Exception {
  
        private String mensagemErro; 
        
        public ParametrosInvalidosException(String mensagemErro) {
            this.mensagemErro = mensagemErro;
        }

        @Override
        public String getMessage() {
            return mensagemErro;
        }
    
}
