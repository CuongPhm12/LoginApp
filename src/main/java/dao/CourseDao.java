package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.CourseDto;
import dto.UserDto;
import utils.DatabaseUitls;

public class CourseDao {
	public List<CourseDto> listCourse() throws SQLException {
		Connection connection = DatabaseUitls.getConnection();
		PreparedStatement statement = connection.prepareStatement("select * from course");

		ResultSet resultSet = statement.executeQuery();
		List<CourseDto> listCourse = new ArrayList<>();
		while (resultSet.next()) {
			String course_id = resultSet.getString(1);
			String subject_id = resultSet.getString(2);
			String course_code = resultSet.getString(3);
			String title = resultSet.getString(4);
			int number_of_credits = resultSet.getInt(5);
//		CourseDto courseDto = new CourseDto(course_id, subject_id, course_code, title, number_of_credits);

			CourseDto courseDto = new CourseDto(course_id, subject_id, course_code, title, number_of_credits);
			listCourse.add(courseDto);

		}
		return listCourse;
	}
}
