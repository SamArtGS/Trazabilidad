//
//  Mapa.swift
//  Trazabilidad
//
//  Created by Samuel Arturo Garrido Sánchez on 9/23/19.
//  Copyright © 2019 SamArtGS. All rights reserved.
//

import UIKit
import GoogleMaps

class Mapa: UIViewController {
    
    override func loadView() {
        super.viewDidLoad()
        
        let camera = GMSCameraPosition.camera(withLatitude: +31.75097946, longitude: +35.23694368, zoom: 17.0)
        let mapView = GMSMapView(frame: CGRect.zero, camera: camera)
        //Crashea en esta parte la wea
        do {
            if let styleURL = Bundle.main.url(forResource: "style", withExtension: "json") {
                mapView.mapStyle = try GMSMapStyle(contentsOfFileURL: styleURL)
            } else {
                NSLog("No se abrió el diseño")
            }
        } catch {
            NSLog("Salió mal. \(error)")
        }
        
        
        
        self.view = mapView
        
        // Crear marcador en el mapa por allá en los bombarderos
        let marker = GMSMarker()
        marker.position = CLLocationCoordinate2D(latitude: +31.75097946, longitude: +35.23694368)
        marker.title = "Protacos"
        marker.map = mapView
        //view.addSubview(Mapa) //No funciona con subvista
        
        self.title = "Mapa de Track"
        
        navigationController?.navigationBar.barTintColor = UIColor(red:0.00, green:0.13, blue:0.52, alpha:1.0)
        self.navigationController?.navigationBar.barStyle = UIBarStyle.black
        
    }
    
    
    
}
