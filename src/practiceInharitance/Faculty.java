package practiceInharitance;

class Faculty {
	float total_sal = 0, salary = 30000;
}

class HRA extends Faculty {
	float hra = 3000;
}

class DA extends HRA {
	float da = 2000;
}


