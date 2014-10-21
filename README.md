EMF Tutorial
============

This tutorial covers the basics of the [Eclipse Modeling Framework (EMF)](http://www.eclipse.org/emf). It provides a brief introduction to EMF and projects containing a small tournament example. The presentation provides a very brief overview of EMF, plus some additional resources, including more detailed tutorials.

The projects provide the final result, which includes the tournament model, its genmodel and class diagram and the generated model, edit and editor code. Custom code (see `TournamentExample`, `ResourceHelper` and `MatchItemProvider` classes) is provided that contains examples of how to achieve the following:

- Create a model using the generated model code,
- Serialize and deserialize a model,
- Get notified when the model changes,
- Use a customized resource factory,
- Access properties of the model in a reflective way,
- Change the textual representation of a model element in the editor and
- Change the choice of values provided for a property in the editor

## Requirements

Use the [Eclipse Modeling Tools](https://www.eclipse.org/downloads/) package.

## Get the example model

Simply run `com.mattsch.emf.examples.test.TournamentExample` and the example model will be saved to `examples/FIFAWorldCup2014.tournament` in the same project.

## How to use the generated editor

- Right-Click on the `.editor` project
- Select `Run As > Eclipse Application`
- In the second Eclipse instance, either
    1. Drag in the example model into the editor area or
    1. Create a new model in a project by going to  and selecting `.
        - Go to `File > New > Other...`
        - Select Tournament Model` from the `Example EMF Model Creation Wizards` category
        - Choose `Tournament` as the model object