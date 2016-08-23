def pipeline() {
	node {
		stage 'Build'

		stage 'Test'

		stage 'Deploy to Dev'

		stage 'Test Dev'

		stage 'Deploy to Stage'

		stage 'Test Stage'

		stage 'Deploy to Canary'

		stage 'Test Canary'

		stage 'Deploy to Production'

		stage 'Test Production'

	}

}

def deploy() {

}

this.pipeline()