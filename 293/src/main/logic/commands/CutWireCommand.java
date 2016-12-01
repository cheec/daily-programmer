package main.logic.commands;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import main.model.wire.BlackWire;
import main.model.wire.GreenWire;
import main.model.wire.OrangeWire;
import main.model.wire.PurpleWire;
import main.model.wire.RedWire;
import main.model.wire.WhiteWire;
import main.model.wire.Wire;
import main.model.wire.WireCutter;
import main.model.wire.WireOperator;
import main.util.Messages;

public class CutWireCommand implements Command {
    
    private List<Wire> wires;
    private WireOperator cutter = new WireCutter();
    
    public CutWireCommand(String... args) {
        wires = Stream.of(args).map(a -> {
            if (a.equalsIgnoreCase(WhiteWire.WIRE_NAME)) {
                return new WhiteWire();
            } else if (a.equalsIgnoreCase(RedWire.WIRE_NAME)) {
                return new RedWire();
            } else if (a.equalsIgnoreCase(BlackWire.WIRE_NAME)) {
                return new BlackWire();
            } else if (a.equalsIgnoreCase(OrangeWire.WIRE_NAME)) {
                return new OrangeWire();
            } else if (a.equalsIgnoreCase(GreenWire.WIRE_NAME)) {
                return new GreenWire();
            } else { // assumes valid input
                return new PurpleWire();
            }
        }).collect(Collectors.toList());
    }
    
    @Override
    public Result execute() {
        if (wires.size() < 2) {
            return new Result(Messages.MESSAGE_SUCCESS);
        }
        boolean isCutSuccessful =
                IntStream.range(1, wires.size()).allMatch(i -> cutter.isOperable(wires.get(i - 1), wires.get(i)));
        return new Result(isCutSuccessful ? Messages.MESSAGE_SUCCESS : Messages.MESSAGE_FAIL);
    }
    
}
