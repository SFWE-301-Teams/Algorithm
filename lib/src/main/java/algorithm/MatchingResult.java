package algorithm;

public class MatchingResult<T extends IScholarship> {
    public T scholarship;
    public Integer score;

    MatchingResult(T scholarship, Integer score) {
        this.scholarship = scholarship;
        this.score = score;
    }
}
