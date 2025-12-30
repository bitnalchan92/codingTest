aver_score_of_grade_info = {
    'A+': 4.5,
    'A0': 4.0,
    'B+': 3.5,
    'B0': 3.0,
    'C+': 2.5,
    'C0': 2.0,
    'D+': 1.5,
    'D0': 1.0,
    'F': 0.0
}

# 전공평점 = (전공과목별 ( 학점 * 과목평점 )의 합) / (학점의 총합)
tot = 0  # 전공과목별 ( 학점 * 과목평점 )의 합
tot_hak_jum = 0  # 학점의 총합
for _ in range(20):
    score_info = input().split()  # 과목명, 학점, 등급이 공백으로 구분되어 20개 주어짐
    grade = score_info[2]
    if grade == 'P':
        continue

    hak_jum = float(score_info[1])  # 학점
    tot_hak_jum += hak_jum

    aver_score_of_grade = aver_score_of_grade_info.get(grade)  # 과목 평점
    tot += (hak_jum * aver_score_of_grade)

print(tot / tot_hak_jum)