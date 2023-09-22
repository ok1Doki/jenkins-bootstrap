# Jenkins Bootstrap 
~ Infrastructure and Configuration as Code

## Fetching Credentials and Properties

To use this application, you need to fetch credentials and properties from AWS, GitHub, and DockerHub and save them to a
.env file.

1. **Generate a GitHub Access Token:**
    - Log in to GitHub.
    - Go to Settings > Developer settings > Personal access tokens.
    - Generate a token with repo and read:user scopes.
    - Copy the token and add it to your .env file
    ```
       GITHUB_ACCESS_TOKEN=your-github-access-token
    ```
2. **Generate DockerHub Access Token:**
    - Log in to DockerHub.
    - Go to Account settings > Security.
    - Create a token with read and write permissions.
    - Add the token and your username to your .env file:
   ```
      DOCKER_HUB_LOGIN_USR=your-dockerhub-username
      DOCKER_HUB_LOGIN_PSW=your-dockerhub-access-token
   ```
3. **Get AWS Access Key and Secret Key:**

    - Log in to AWS Console.
    - Go to IAM > Users.
    - Create or use an existing user with appropriate permissions.
    - Under Security credentials, create an access key.
    - Add the access key and secret key  to your .env file:
    ```
      AWS_ACCESS_KEY=your-aws-access-key
      AWS_SECRET_KEY=your-aws-secret-key
    ```
    - Add your AWS region and subnet ID to your .env file:
    ```
      AWS_REGION=your-aws-region
      AWS_SUBNET_ID=your-aws-subnet-id
    ```
   
## Running Jenkins

`./gradlew docker dockerRun`

Jenkins will then be available at [http://localhost:8080](http://localhost:8080).