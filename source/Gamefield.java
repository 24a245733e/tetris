package com.tetris;

import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.tetris.ui.*;
import com.tetris.gui.*;
import com.tetris.tetrominoes.*;
public class Gamefield implements Observer{

    private final int GAME_DURATION = 1600;
    public boolean GAME_RUNNING = true;
    private int game_step = 0;
    private int ROW_QNTT = 10;

    public ArrayList<Gamefield_row> field = new ArrayList<Gamefield_row>();
    public Tet_no active_tet_no;
    public boolean active_tet_no_set;
    public int keyCode;
    public int row_length;

    public void init_rows() {
        for (int row_counter = 0; row_counter <= ROW_QNTT; row_counter++) {
            print("row(%d) added", row_counter);
            field.add(new Gamefield_row());
        }
        row_length = field.get(0).ROW_LENGTH;
    }
    public static void print(String arg_a, int arg_b) {
        System.out.println(String.format(arg_a, arg_b));
    }
    public void update(KeyEvent keyEvent)
    {
        keyCode = keyEvent.getKeyCode();
        System.out.println(String.format("keyCode: %d", keyCode));
       //do whatever here when key event occurs
    }
    public void check_rows() {
        int k = 0;
        print("check_rows_%d", 1);
        System.out.println(field);
        for (Gamefield_row row : field) {
            boolean row_status = row.check();
            System.out.println(String.format("row(%d) status: %b", k, row_status));
            k += 1;
        }


    }

    public boolean if_fix_tetno() {
        boolean condition_to_fix = check_down_place();
        if (condition_to_fix) {
            return false;
        } else {
            return true;
        }

    }

    public void add_test_tetromino() {

        active_tet_no = new Tet_no(2, 1);
        tet_on();

    }
    public void tet_off() {
        field.get(active_tet_no.y1).cells.get(active_tet_no.x1).off();
        field.get(active_tet_no.y2).cells.get(active_tet_no.x2).off();
        field.get(active_tet_no.y3).cells.get(active_tet_no.x3).off();
        field.get(active_tet_no.y4).cells.get(active_tet_no.x4).off();
    }
    public void tet_on() {
        field.get(active_tet_no.y1).cells.get(active_tet_no.x1).on();
        field.get(active_tet_no.y2).cells.get(active_tet_no.x2).on();
        field.get(active_tet_no.y3).cells.get(active_tet_no.x3).on();
        field.get(active_tet_no.y4).cells.get(active_tet_no.x4).on();
    }
    public void move_test() {
        tet_off();
        active_tet_no.move_down();
        tet_on();

    }

    public void choose_action(){
        if (keyCode == 87) {
            move_up();
        }
        else if (keyCode == 83) {
            move_down();
        }
        else if (keyCode == 68) {
            move_right();
        }
        else if (keyCode == 65) {
            System.out.println("move left");
            move_left();
        }
        keyCode = 0;
    }
    public void move_right() {
        if (active_tet_no.x1 == row_length || active_tet_no.x2 == row_length || active_tet_no.x3 == row_length || active_tet_no.x4 == row_length) {

        } else {
            tet_off();
            active_tet_no.move_right();
            tet_on();
        }
    }
    public void move_left() {
        if (active_tet_no.x1 == 0 || active_tet_no.x2 == 0 || active_tet_no.x3 == 0 || active_tet_no.x4 == 0) {

        } else {
            tet_off();
            active_tet_no.move_left();
            tet_on();
        }
    }
    public void move_up() {
        tet_off();
        active_tet_no.move_up();
        tet_on();
    }
    public boolean check_down_place() {
        // check bottom line
        // boolean bottom_line = false;
        boolean condition_1 = active_tet_no.y1 >= ROW_QNTT;
        boolean condition_2 = active_tet_no.y2 >= ROW_QNTT;
        boolean condition_3 = active_tet_no.y3 >= ROW_QNTT;
        boolean condition_4 = active_tet_no.y4 >= ROW_QNTT;
        boolean condition_a = condition_1 | condition_2 | condition_3 | condition_4;
        boolean condition_b = true;
        boolean condition_c = true;
        for (int one : active_tet_no.bottom_cells) {
            System.out.println(one);
            try {
                if (one == 1) {
                    condition_c = field.get(active_tet_no.y1+1).cells.get(active_tet_no.x1).if_vacant();
                } else if (one == 2) {
                    condition_c = field.get(active_tet_no.y2+1).cells.get(active_tet_no.x2).if_vacant();
                } else if (one == 3) {
                    condition_c = field.get(active_tet_no.y3+1).cells.get(active_tet_no.x3).if_vacant();
                } else if (one == 4) {
                    condition_c = field.get(active_tet_no.y4+1).cells.get(active_tet_no.x4).if_vacant();
                }

            } catch (Exception e) {
                System.out.println("\nException caught");
                return false;
            }

            condition_b = condition_b | condition_c;
            System.out.println(String.format("condition_a: %b", condition_a));
        }

        // boolean condition_b = condition_1 | condition_2 | condition_3 | condition_4;
        boolean check_result;
        check_result = true;
        if (condition_a & condition_b == false) {
                check_result = false;
        }

        return check_result;

    }
    public void move_down() {
        // check_down_place();
        if (check_down_place()){
            tet_off();
            active_tet_no.move_down();
            tet_on();
        }
    }
    public void action(){
        print("game step: %d", game_step);
        check_rows();
    }

    public void clear_row(int row_pos) {
        print("row %d cleared", row_pos);
    }

    public void play(){
        System.out.println("game started");
        init_rows();

        while (GAME_RUNNING) {

            action();

            if (game_step >= GAME_DURATION) {
                GAME_RUNNING = false;
            }

            if (GAME_RUNNING != true) {
                stop();
            }
            game_step += 1;
        }


    }
    public void stop(){
        System.out.println("game stoped");
    }
    // void remove_row(Row row){
    // }
    // public void add_new_tet_no(Tet_no tet_no){
    // }
    // public void move_side_tet_no(Side side, Tet_no tet_no){
    // }
    // public void move_step_down_tet_no(Tet_no tet_no){
    // }
    // public void move_all_the_way_down_tet_no(Tet_no tet_no){
    // }
    // public void check_place_for_tet_no(Tet_no tet_no){
    // }
}
