def call(){
    sh """
     curl "https://d1vvhvl2y92vvt.cloudfront.net/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip
     sudo unzip awscliv2.zip
     sudo ./aws/install
    """
}