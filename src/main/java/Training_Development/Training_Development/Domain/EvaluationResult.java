package Training_Development.Training_Development.Domain;

    public class EvaluationResult {

        // 1️⃣ Atributos
        private int resultId;
        private int evaluationId;
        private String status;
        private String learningLevel;
        private String recommendations;
        private boolean passed;

        // 2️⃣ Constructores
        public EvaluationResult() {
        }

        public EvaluationResult(int resultId, int evaluationId, String status, String learningLevel, String recommendations, boolean passed) {
            this.resultId = resultId;
            this.evaluationId = evaluationId;
            this.status = status;
            this.learningLevel = learningLevel;
            this.recommendations = recommendations;
            this.passed = passed;
        }

        // 3️⃣ Métodos de negocio
        public void calculateResult() {
            // logic to calculate result
        }

        public void generateReport() {
            // logic to generate report
        }

        public void displayResult() {
            // logic to display result
        }

        // 4️⃣ Getters y Setters
        public int getResultId() {
            return resultId;
        }

        public void setResultId(int resultId) {
            this.resultId = resultId;
        }

        public int getEvaluationId() {
            return evaluationId;
        }

        public void setEvaluationId(int evaluationId) {
            this.evaluationId = evaluationId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getLearningLevel() {
            return learningLevel;
        }

        public void setLearningLevel(String learningLevel) {
            this.learningLevel = learningLevel;
        }

        public String getRecommendations() {
            return recommendations;
        }

        public void setRecommendations(String recommendations) {
            this.recommendations = recommendations;
        }

        public boolean isPassed() {
            return passed;
        }

        public void setPassed(boolean passed) {
            this.passed = passed;
        }
    }

