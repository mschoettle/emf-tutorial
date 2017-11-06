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
- Change the textual representation of a model element in the editor,
- Change the choice of values provided for a property in the editor, and
- Add an OCL constraint to the metamodel

To see the evolution of the model and custom modifications, check the commit history.

## Requirements

Use the latest [Eclipse Modeling Tools](https://www.eclipse.org/downloads/) package.

## Get the example model

Simply run `com.mattsch.emf.examples.test.TournamentExample` and the example model will be saved to `examples/FIFAWorldCup2014.tournament` in the same project.

## Tasks a participant can do

Besides creating the model from scratch, creating the genmodel, then generating code and creating models, the projects in this repository allow the following small tasks to practice:

- When creating a non-group match and performing validation a problem becomes evident. Address it such that it is possible to create valid models for all kinds of matches.
- With the above problem being addressed, the existing constraint (*groupMatchRequiresGroupKind*) is not sufficient. It is still possible to have no group set, but the match kind is *Group*. Modify the existing one or add an additional constraint to address this.

## How to use the generated editor

- Right-Click on the `.editor` project
- Select `Run As > Eclipse Application`
- In the second Eclipse instance, either
  1. Drag the example model into the editor area or
  2. Create a new model in a project by going to  and selecting `.
    - Go to `File > New > Other...`
    - Select `Tournament Model` from the `Example EMF Model Creation Wizards` category
    - Choose `Tournament` as the model object
    
## How to add and modify constraints

- Right-Click on `Tournament.ecore` in the model project
- Select *Open With* > *OCLinEcore Editor*
- Find the existing invariant (constraint) for an example
- **Important:** After modifying or adding constraints, the model code needs to be re-generated