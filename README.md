
# **Gym Equipment Tracker API**

## **Overview**

The **Gym Equipment Tracker API** is designed to assist gym owners and trainers in managing and tracking gym equipment usage. The API provides users with the ability to:

- **Add**, **update**, and **delete** gym equipment records.
- **Track** the availability and status of equipment.
- **View** a log of equipment usage.

Although deployment to a production environment was not successful, the project can still be run **locally**, and its **core functionalities** are implemented.

## **Features**

- **CRUD Operations**: Add, update, delete, and view gym equipment.
- **Track Usage**: Record equipment usage and availability status.
- **User Authentication**: Secure endpoints for gym trainers and admins.

## **API Endpoints**

- **GET** `/equipment/` - List all gym equipment
- **POST** `/equipment/` - Add new gym equipment
- **PUT** `/equipment/<id>/` - Update equipment details
- **DELETE** `/equipment/<id>/` - Delete equipment

## **Limitations**

- Deployment to a production environment (e.g., Heroku, AWS, etc.) was not completed.
- Some features, such as **user authentication**, may not be fully functional without further configuration.

## **Future Work**

- Implement **user authentication** for admins and trainers.
- Deploy the API to a **cloud service** like Heroku or AWS.
- Add additional features, such as **equipment maintenance scheduling**.
