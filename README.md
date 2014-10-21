EMF Tutorial
============

This tutorial covers the basics of the [Eclipse Modeling Framework (EMF)](http://www.eclipse.org/emf). It was given to students of a class at McGill University. The tutorial provided a brief overview of EMF and showed how to

- create an Ecore model (using the tree editor and graphically using Sirius)
- create a dynamic instance of the model,
- create the generator model and use/tweak it,
- generate model, edit and editor code,
- create models (instances of the model) using the generated editor,
- create a model programmatically,
- serialize and deserialize a model,
- observe the model for modifications and
- adjust the generated code

based on a small tournament example.

The **presentation** provides a very brief overview of EMF, plus some additional resources, including the EMF book and more detailed tutorials.

The **projects** provide the final result, which includes the tournament model, its genmodel and class diagram and the generated model, edit and editor code. Custom code (see `TournamentExample`, `ResourceHelper` and `MatchItemProvider` classes) is provided that contains examples of how to achieve the following:

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
  2. Create a new model in a project by going to  and selecting `.
    - Go to `File > New > Other...`
    - Select Tournament Model` from the `Example EMF Model Creation Wizards` category
    - Choose `Tournament` as the model object
