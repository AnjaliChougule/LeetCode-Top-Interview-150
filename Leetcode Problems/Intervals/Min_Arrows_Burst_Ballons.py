class Solution:
    def findMinArrowShots(self, points: List[List[int]]) -> int:
        points.sort()
        n_arrow, arrow = 1, points[-1][0]
        for i in range(len(points)-2, -1, -1):
            if not points[i][0]<=arrow<=points[i][1]:
                arrow = points[i][0]
                n_arrow += 1
        return n_arrow
    
if __name__ == "__main__":
    points = [[10,16],[2,8],[1,6],[7,12]]
    print(Solution().findMinArrowShots(points))