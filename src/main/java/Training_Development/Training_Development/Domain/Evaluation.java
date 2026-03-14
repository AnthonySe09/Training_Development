package Training_Development.Training_Development.Domain;

import java.util.Date;

    public class Evaluation {




        private int evaluationId;
        private int employeeId;
        private int courseId;
        private Date evaluationDate;
        private String evaluationType;
        private double score;
        private String comments;

        public Evaluation() {
        }

        public Evaluation(int evaluationId, int employeeId, int courseId, Date evaluationDate, String evaluationType, double score, String comments) {
            this.evaluationId = evaluationId;
            this.employeeId = employeeId;
            this.courseId = courseId;
            this.evaluationDate = evaluationDate;
            this.evaluationType = evaluationType;
            this.score = score;
            this.comments = comments;
        }

        public void registerEvaluation() {
            // logic to register evaluation
        }
        public void updateEvaluation() {
            // logic to update evaluation
        }

        public void deleteEvaluation() {
            // logic to delete evaluation
        }

        public void generateResult() {
            // logic to generate evaluation result
        }

        public int getEvaluationId() {
            return evaluationId;
        }

        public void setEvaluationId(int evaluationId) {
            this.evaluationId = evaluationId;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }

        public Date getEvaluationDate() {
            return evaluationDate;
        }

        public void setEvaluationDate(Date evaluationDate) {
            this.evaluationDate = evaluationDate;
        }

        public String getEvaluationType() {
            return evaluationType;
        }

        public void setEvaluationType(String evaluationType) {
            this.evaluationType = evaluationType;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }
    }

