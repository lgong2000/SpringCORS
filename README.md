# SpringCORS

## Version 1
RestController for Coffee List

## Version 2
Create frontend - Vue - https://vuejs.org/guide/quick-start.html
1. SpringCORS Location - D:\GitHub\SpringCORS
    Windows Command Prompt/Intellij Terminal - D:\GitHub\SpringCORS\src\main - npm create vue@latest (npm init vue@lastest for first time)
        Project name: frontend
        Add TypeScript: Yes
        Add JSX Support: No
        Add Vue Router for Single Page Application development: No
        Add Pinia for state management: No
        Add Vitest for Unit Testing: No
        Add an End-to-End Testing Solution: No
        Add ESLint for code quality: No
        Add Vue DevTools 7 extension for debugging: No
2. cd frontend
3. npm install
4. npm run dev
   http://localhost:5174/

## Version 3
Clean Vue Project - Delete components, assets
npm run dev - 
    Access to fetch at 'http://localhost:8080/api/coffee' from origin 'http://localhost:5174' has been blocked by CORS policy

## Version 4
@CrossOrigin
@CrossOrigin(origins = "http://localhost:5174")
Enable CrossOrigin in Class Level

## Version 5
@CrossOrigin
@CrossOrigin(origins = "http://localhost:5174")
Enable CrossOrigin in Method Level

## Version 6
CrossOrigin Global settings by WebMvcConfigurer

## Version 7
Remove WebMvcConfigurer
SecurityFilterChain
    .cors(withDefaults()) - CorsConfigurationSource