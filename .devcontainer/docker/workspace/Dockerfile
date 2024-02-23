# ubuntuを使うという宣言
FROM ubuntu:22.04

# 変数定義
ARG USER_NAME=vscode
ARG USER_GROUP_NAME=workspace
ARG USER_ID=1000
ARG USER_GID=1000

ARG PKG="git curl unzip zip sudo"

# dokerコンテナ内でコマンドを実行する時にbashを使用するように指定する
SHELL [ "/bin/bash", "-c" ]

# コンテナ起動時に実行するコマンド群
RUN apt-get update \
    && apt-get install -y ${PKG} \
    && groupadd --gid ${USER_GID} ${USER_GROUP_NAME} \
    && useradd --uid ${USER_ID} --shell /bin/bash --gid ${USER_GID} -m ${USER_NAME} \
    && echo %${USER_GROUP_NAME} ALL=\(ALL\) NOPASSWD:ALL > /etc/sudoers.d/${USER_GROUP_NAME} \
    && chmod 0440 /etc/sudoers.d/${USER_GROUP_NAME}

ARG JAVA_VERSION=18.0.2-amzn
ARG GRADLE_VERSION=7.5

RUN su ${USER_NAME} --command \
    'curl -s "https://get.sdkman.io" | bash \
    && source "${HOME}/.sdkman/bin/sdkman-init.sh" \
    && sdk install java "${JAVA_VERSION}" \
    && sdk install gradle "${GRADLE_VERSION}"'