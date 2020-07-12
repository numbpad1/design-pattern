package com.numbpad1.pattern.state;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
        this.state.execute();
    }

    public void execute(int stateType){
        if (stateType == 1){
            this.state = new ApprovingState();
            this.state.execute();
        }else if (stateType == 2){
            this.state = new ApprovedState();
            this.state.execute();
        }else if (stateType == 3){
            this.state = new FinishedState();
            this.state.execute();
        }
    }
}
