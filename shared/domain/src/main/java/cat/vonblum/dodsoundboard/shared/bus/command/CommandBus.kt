package cat.vonblum.dodsoundboard.shared.bus.command

interface CommandBus {

    fun dispatch(command: Command)

}