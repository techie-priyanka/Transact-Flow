# Transact-Flow is a scalable backend service designed to handle high volumes of payment transactions. It ensures efficient, concurrent processing of payment intents across distributed nodes.
Java | Spring Boot | PostgreSQL | Kafka | Docker | Kubernetes

# Features
-Batch Processing: Efficiently processes payment intents in configurable batch sizes.

-Concurrency Control: Prevents duplicate processing using row-level locking with FOR UPDATE SKIP LOCKED.

-Scalability: Easily scales horizontally with multiple Kubernetes replicas.

-Resilience: Handles node crashes gracefully with retry mechanisms and timeout handling.

-Monitoring: Integrated Prometheus metrics for real-time monitoring and alerting.

-Dockerized: Containerized application for easy deployment and management.
